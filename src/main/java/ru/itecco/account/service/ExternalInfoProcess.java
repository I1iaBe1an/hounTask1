
package ru.itecco.account.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import ru.itecco.account.model.ExternalInfo;

/**
 * ExternalInfoProcess.
 *
 * @author Belan Ilya
 */
@Slf4j
public class ExternalInfoProcess implements Process {

    @Value("${id-not-process}")
    private Integer id;

    @Override
    public boolean run(ExternalInfo externalInfo) {
        if (id.equals(externalInfo.getId())) {
            log.info("Process not need: {}", externalInfo);
            return false;
        }
        log.info("Process with: {}", externalInfo);
        return true;
    }

}