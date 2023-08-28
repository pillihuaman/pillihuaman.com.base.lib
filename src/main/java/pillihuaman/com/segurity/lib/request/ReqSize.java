package pillihuaman.com.segurity.lib.request;

import pillihuaman.com.segurity.lib.commons.Parameters;

import java.util.List;

public class ReqSize {

    private Parameters parameter;
    List<ReqColor> color;

    public Parameters getParameter() {
        return parameter;
    }

    public void setParameter(Parameters parameter) {
        this.parameter = parameter;
    }

    public List<ReqColor> getColor() {
        return color;
    }

    public void setColor(List<ReqColor> color) {
        this.color = color;
    }
}
