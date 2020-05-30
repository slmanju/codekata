package com.slmanju.leaves.ports.in;

import com.slmanju.leaves.entities.Leave;

import java.util.List;

public interface ListLeaveUseCasePort {

  List<Leave> findAll();

}
