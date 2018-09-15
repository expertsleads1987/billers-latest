package generated.biller.experts.api.wsdl.prepaid;

import com.experts.core.biller.statemachine.api.soapService.PaymentNotificationResponse;
import com.experts.core.biller.statemachine.api.soapService.PrePaidServiceResponse;
import generated.biller.experts.api.wsdl.pull.BillPullServiceResponse;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(namespace = "http://localhost:3070/notifications", name = "NotificationRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso(ArrayList.class)
public class PrePaidPaymentDTO {

    @XmlElement(name = "reponse")
    private List<PrePaidServiceResponse> arr = new ArrayList<PrePaidServiceResponse>();

    public List<PrePaidServiceResponse> getArr() {
        return arr;
    }

    public void setArr(List<PrePaidServiceResponse> arr) {
        this.arr = arr;
    }

}
