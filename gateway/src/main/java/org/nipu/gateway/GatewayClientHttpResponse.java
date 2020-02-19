package org.nipu.gateway;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class GatewayClientHttpResponse implements ClientHttpResponse {
    @Override
    public HttpStatus getStatusCode() throws IOException {
        return HttpStatus.GATEWAY_TIMEOUT;
    }

    @Override
    public int getRawStatusCode() throws IOException {
        return getStatusCode().value();
    }

    @Override
    public String getStatusText() throws IOException {
        return getStatusCode().getReasonPhrase();
    }

    @Override
    public void close() { }

    @Override
    public InputStream getBody() throws IOException {
        return new ByteArrayInputStream("Gateway fallback".getBytes());
    }

    @Override
    public HttpHeaders getHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return httpHeaders;
    }
}
