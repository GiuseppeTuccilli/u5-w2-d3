package giuseppetuccilli.u5_w2_d3.exeptions;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class ErrorsPayload {
    private String message;
    private LocalDate data;
}
