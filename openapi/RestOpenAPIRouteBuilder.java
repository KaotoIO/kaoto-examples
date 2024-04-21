import org.apache.camel.builder.RouteBuilder;

public class RestOpenAPIRouteBuilder extends RouteBuilder {

    public void configure() throws Exception {
        restConfiguration().apiContextPath("/q/openapi");
    }
}
