package filter.generalfilter;

/**
 * Created by wyb.
 */
public class App {

    public static void main(String[] args) {
        String msg = "大家好:), <script>, 敏感, 被就业, 网络授课没感觉, 看不见";
        FilterChain fc = new FilterChain();
        // 链条式编程
        fc.addFilter(new HtmlFilter()).addFilter(new SensitiveFilter()).addFilter(new FaceFilter());
        MsgProcessor mp = new MsgProcessor(msg, fc);
        String result = mp.process();
        System.out.println(result);
    }
}
