package {{ parameters.package }}.application.usecases;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import {{ parameters.package }}.application.interfaces.inbound.ProcessRequest;
import {{ parameters.package }}.application.interfaces.outbound.GetData;
import {{ parameters.package }}.infrastructure.inbound.rest.dto.request.RequestDTO;
import {{ parameters.package }}.infrastructure.inbound.rest.dto.response.ResponseDTO;
import {{ parameters.package }}.utils.defaults.CodeMessage;

@ApplicationScoped
@Slf4j
public class ProcessRequestImpl implements ProcessRequest {
    @Inject
    GetData getData;
    @Override
    public ResponseDTO process(RequestDTO requestDTO) {

        // Conversions and logic goes here for integrations

        if (!getData.get(requestDTO)) {
            throw new IllegalArgumentException("No se pudo enviar el mensaje.");
        }
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMensaje(requestDTO.getMensaje());
        responseDTO.setStatus(CodeMessage.Code200);
        log.info("Response: {}", responseDTO);
        return responseDTO;
    }
}
