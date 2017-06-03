package filter.generalfilter;

/**
 * Created by wyb.
 */
public class MsgProcessor {
    private String msg;

    //Filter[] filters = {new HtmlFilter(), new SensitiveFilter(), new FaceFilter()};

    FilterChain fc;

    public MsgProcessor(String msg, FilterChain fc) {
        this.msg = msg;
        this.fc = fc;
    }

    public FilterChain getFc() {
        return fc;
    }

    public String getMsg() {
        return msg;
    }

    public String process() {

        return fc.doFilter(msg);
    }
}
