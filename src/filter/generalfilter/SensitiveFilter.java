package filter.generalfilter;

/**
 * Created by wyb.
 */
public class SensitiveFilter implements Filter {
    @Override
    public String doFilter(String str) {
        return str.replace("被就业", "就业").replace("敏感", "");
    }
}
