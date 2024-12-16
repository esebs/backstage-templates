package {{ parameters.package }}.application.interfaces.inbound;

import {{ parameters.package }}.infrastructure.inbound.rest.dto.request.RequestDTO;
import {{ parameters.package }}.infrastructure.inbound.rest.dto.response.ResponseDTO;

public interface ProcessRequest {
    ResponseDTO process(RequestDTO requestDTO);
}
