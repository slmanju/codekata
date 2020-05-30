package com.slmanju.leaves.ports.in;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

public interface ApplyLeaveUseCasePort {

  void applyLeave(ApplyLeaveCommand applyLeaveCommand);

  @Getter @Builder @NoArgsConstructor
  class ApplyLeaveCommand {
    private int numberOfDays;
    private String reason;
    private LocalDate fromDate;
    private LocalDate toDate;
  }

}
