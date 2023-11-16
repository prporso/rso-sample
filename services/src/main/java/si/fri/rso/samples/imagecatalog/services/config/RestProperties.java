package si.fri.rso.samples.imagecatalog.services.config;
import javax.enterprise.context.ApplicationScoped;
import com.kumuluz.ee.configuration.cdi.ConfigBundle;
import com.kumuluz.ee.configuration.cdi.ConfigValue;
@ConfigBundle("rest-properties")
@ApplicationScoped
public class RestProperties {

    private Boolean broken;

    public Boolean getBroken() {
        return broken;
    }

    public void setBroken(final Boolean broken) {
        this.broken = broken;
    }

}
