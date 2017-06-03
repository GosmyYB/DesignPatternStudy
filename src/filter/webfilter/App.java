package filter.webfilter;

/**
 * Created by wyb.
 */
public class App {
    public static void main(String[] args) {
        String msg = "大家好:), <script>, 敏感, 被就业, 网络授课没感觉, 看不见";
        Request request = new Request();
        request.setRequestMsg(msg);
        Response response = new Response();
        response.setResponseMsg("response");

        FilterChain fc = new FilterChain();

        fc.addFilter(new HtmlFilter())
                .addFilter(new SensitiveFilter());

        fc.doFilter(request, response, fc);

        System.out.println(request.getRequestMsg());
        System.out.println(response.getResponseMsg());
    }
}
