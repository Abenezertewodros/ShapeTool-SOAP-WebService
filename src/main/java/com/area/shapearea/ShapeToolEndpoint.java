package com.area.shapearea;

import com.area.shapearea.area.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ShapeToolEndpoint {
//
    private static final String NAMESPACE_URI = "http://example.com/shapetool";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CircleAreaRequest")
    @ResponsePayload
    public CircleAreaResponse circleArea(@RequestPayload CircleAreaRequest request) {
        double area = Math.PI * request.getRadius() * request.getRadius();
        CircleAreaResponse response = new CircleAreaResponse();
        response.setArea(area);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SquareAreaRequest")
    @ResponsePayload
    public SquareAreaResponse squareArea(@RequestPayload SquareAreaRequest request) {
        double area = request.getRadius() * request.getRadius();
        SquareAreaResponse response = new SquareAreaResponse();
        response.setArea(area);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "RectangleAreaRequest")
    @ResponsePayload
    public RectangleAreaResponse rectangleArea(@RequestPayload RectangleAreaRequest request) {
        double area = request.getLength() * request.getWidth();
        RectangleAreaResponse response = new RectangleAreaResponse();
        response.setArea(area);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ParallelogramAreaRequest")
    @ResponsePayload
    public ParallelogramAreaResponse parallelogramArea(@RequestPayload ParallelogramAreaRequest request) {
        double area = request.getBase() * request.getHeight();
        ParallelogramAreaResponse response = new ParallelogramAreaResponse();
        response.setArea(area);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "TriangleAreaRequest")
    @ResponsePayload
    public TriangleAreaResponse triangleArea(@RequestPayload TriangleAreaRequest request) {
        double area = 0.5 * request.getBase() * request.getHeight();
        TriangleAreaResponse response = new TriangleAreaResponse();
        response.setArea(area);
        return response;
    }
}