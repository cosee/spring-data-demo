package biz.cosee.advanced.projection;

import org.springframework.beans.factory.annotation.Value;

public interface MilkyWayNoInternalName {

    //@Value("#{(target.password == null || target.password.empty) ? null : '******'}")
    @Value("#{target.id}")
    Long getArticleId();

    String getName();

    String getDescription();
}
