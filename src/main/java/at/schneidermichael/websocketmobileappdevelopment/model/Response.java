package at.schneidermichael.websocketmobileappdevelopment.model;

import java.util.List;

public class Response {
    private List<Data> data;
    private String type;

    public Response(List<Data> data, String type) {
        this.data = data;
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
                "\"data\":" + data +
                ", \"type\":\"" + type + '\"' +
                '}';
    }
}
