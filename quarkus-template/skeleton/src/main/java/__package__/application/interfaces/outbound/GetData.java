package {{ parameters.package }}.application.interfaces.outbound;

import {{ parameters.package }}.infrastructure.inbound.rest.dto.request.RequestDTO;

public interface GetData {
    boolean get(RequestDTO requestDTO);
}
