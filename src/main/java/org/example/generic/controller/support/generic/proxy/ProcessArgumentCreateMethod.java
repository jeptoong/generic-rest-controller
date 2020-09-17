package org.example.generic.controller.support.generic.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.generic.controller.support.generic.annotation.APIGeneric.APIGenericMethod.CREATE;

/**
 * Class extends {@link ProcessArgument} for Create Method.
 *
 * @author hungp
 */
@Slf4j
@Component
public class ProcessArgumentCreateMethod extends ProcessArgument {

    @Override
    public Object[] prepareArguments(Object[] args, Class<?> entityType, Class<?> controllerType) {
        if (null != args && args.length > 0) {
            return new Object[]{convertToDataTransferObject(args[0], getDTORequestType(controllerType, CREATE))};
        }
        return args;
    }
}
