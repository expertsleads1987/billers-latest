package com.experts.core.biller.statemachine.api.spintegrations.gateway;

import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;

import java.util.Map;

public interface BillerGatewayCoreEngine {
    void payloadAndHeaderMapWithoutAnnotations(String s, Map<String, Object> map);

    void payloadAndHeaderMapWithAnnotations(@Payload String s, @Headers Map<String, Object> map);

    void headerValuesAndPayloadWithAnnotations(@Header("k1") String x, @Payload String s, @Header("k2") String y);

    void mapOnly(Map<String, Object> map); // the payload is the map and no custom headers are added

    void twoMapsAndOneAnnotatedWithPayload(@Payload Map<String, Object> payload, Map<String, Object> headers);

    @Payload("#args[0] + #args[1] + '!'")
    void payloadAnnotationAtMethodLevel(String a, String b);

    @Payload("@someBean.exclaim(#args[0])")
    void payloadAnnotationAtMethodLevelUsingBeanResolver(String s);

    void payloadAnnotationWithExpression(@Payload("toUpperCase()") String s);

    void payloadAnnotationWithExpressionUsingBeanResolver(@Payload("@someBean.sum(#this)") String s); //  1

    // invalid
    void twoMapsWithoutAnnotations(Map<String, Object> m1, Map<String, Object> m2);

    // invalid
    void twoPayloads(@Payload String s1, @Payload String s2);

    // invalid
    void payloadAndHeaderAnnotationsOnSameParameter(@Payload @Header("x") String s);

    // invalid
    void payloadAndHeadersAnnotationsOnSameParameter(@Payload @Headers Map<String, Object> map);
}
