package chap06


import spock.lang.Specification

import java.time.DayOfWeek
import java.time.Duration
import java.time.LocalDateTime
import java.time.LocalTime

class EventSpecification extends Specification {

    def "이벤트를 등록한다"() {
        expect:
        new Event("회의", LocalDateTime.of(2019, 5, 8, 10, 30),
                Duration.ofMinutes(30))

    }

    def "반복 이벤트"() {
        expect:
        new RecurringSchedule("회의", DayOfWeek.WEDNESDAY, LocalTime.of(10, 30), Duration.ofMinutes(30))
    }

    def "반복 조건을 만족한다"() {
        def recurringEvent = new RecurringSchedule("회의", DayOfWeek.WEDNESDAY, LocalTime.of(10, 30), Duration.ofMinutes(30))
        def meeting = new Event("회의", LocalDateTime.of(2019, 5, 8, 10, 30),
                Duration.ofMinutes(30))

        expect:
        meeting.isSatisfied(recurringEvent)
    }

    def "반복 조건을 만족한다 - command 는 항상 같은 응답을 내려줘야한다"() {
        def recurringEvent = new RecurringSchedule("회의", DayOfWeek.WEDNESDAY, LocalTime.of(10, 30), Duration.ofMinutes(30))
        def meeting = new Event("회의", LocalDateTime.of(2019, 5, 9, 10, 30),
                Duration.ofMinutes(30))

        expect:
        !meeting.isSatisfied(recurringEvent)
        meeting.reschedule(recurringEvent)
        meeting.isSatisfied(recurringEvent)

    }
}
