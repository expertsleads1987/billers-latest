package generated.biller.experts.api.wsdl.notifications;

import com.experts.core.biller.statemachine.api.soapService.PaymentNotificationResponse;
import generated.biller.experts.api.wsdl.pull.BillPullServiceResponse;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(namespace = "http://localhost:3070/notifications", name = "NotificationRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso(ArrayList.class)
public class PaymentNotificationDTO {

    @XmlElement(name = "reponse")
    private List<PaymentNotificationResponse> arr = new ArrayList<PaymentNotificationResponse>();

    public List<PaymentNotificationResponse> getArr() {
        return arr;
    }

    public void setArr(List<PaymentNotificationResponse> arr) {
        this.arr = arr;
    }

}
