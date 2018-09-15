package generated.biller.experts.api.wsdl.pull;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(namespace = "http://localhost:3070/billpull", name = "BillPullRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso(ArrayList.class)
public class BillPullResponseDTO {

    @XmlElement(name = "reponse")
    private List<BillPullServiceResponse> arr = new ArrayList<BillPullServiceResponse>();

    public List<BillPullServiceResponse> getArr() {
        return arr;
    }

    public void setArr(List<BillPullServiceResponse> arr) {
        this.arr = arr;
    }
}
