import com.juanmuscaria.autumn.messages.standard.ReloadableResourceBundleMessageSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class BasicTestToSeeIfItWorks {
    
    @Test
    void doTest() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("bundle");
        messageSource.setDefaultLocale(Locale.ENGLISH);
        Assertions.assertEquals("aaaa", messageSource.getMessage("aaaaa", new Object[0], Locale.ENGLISH));

        Assertions.assertEquals("bbbb", messageSource.getMessage("aaaaa", new Object[0], Locale.of("pt", "BR")));
    }
}
