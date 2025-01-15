package com.mokako.platform.attendance;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    List<Attendance> findByUserIdAndExitTimeIsNull(Long userId);

    List<Attendance> findByUserIdAndEntryTimeAfter(Long userId, LocalDateTime entryTimeAfter);
}
