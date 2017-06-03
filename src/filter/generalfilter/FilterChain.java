package filter.generalfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyb.
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();

    /**
     * 添加 Filter 返回 FilterChain实例是为了支持链条式编程.
     *
     * @param f
     * @return FilterChain
     */
    public FilterChain addFilter(Filter f) {
        filters.add(f);
        return this;
    }

    @Override
    public String doFilter(String str) {
        for (Filter f : filters) {
            str = f.doFilter(str);
        }
        return str;
    }
}
