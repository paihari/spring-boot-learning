package com.gundi.spring.profile.dataservice;

public class DataSource {

    private String url;
    private String port;

    public DataSource(String url, String port) {
        this.url = url;
        this.port = port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "url='" + url + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
