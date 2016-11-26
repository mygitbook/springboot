package com.ws.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by martin on 11/26/16.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
