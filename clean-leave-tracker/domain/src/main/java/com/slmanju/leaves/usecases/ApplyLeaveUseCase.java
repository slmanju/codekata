package com.slmanju.leaves.usecases;

import com.slmanju.leaves.entities.Leave;
import com.slmanju.leaves.ports.in.ApplyLeaveUseCasePort;
import com.slmanju.leaves.ports.out.SaveLeavePort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class ApplyLeaveUseCase implements ApplyLeaveUseCasePort {

  private final SaveLeavePort saveLeavePort;

  @Override
  public void applyLeave(ApplyLeaveCommand applyLeaveCommand) {
    Leave leave = Leave.builder()
        .fromDate(applyLeaveCommand.getFromDate())
        .toDate(applyLeaveCommand.getToDate())
        .numberOfDays(applyLeaveCommand.getNumberOfDays())
        .reason(applyLeaveCommand.getReason())
        .build();
    saveLeavePort.save(leave);
  }
}
