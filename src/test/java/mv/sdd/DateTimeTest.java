package mv.sdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.*;

class DateTimeTest {

    @Test
    void localdateOperations() {
        LocalDate d = LocalDate.of(2025, 1, 15);
        assertEquals(DayOfWeek.WEDNESDAY, d.getDayOfWeek());
        assertEquals(LocalDate.of(2025,1,22), d.plusWeeks(1));
    }

    @Test
    void durationEtInstant() {
        Instant start = Instant.now();
        Instant end = start.plusSeconds(2);
        Duration dur = Duration.between(start, end);
        assertEquals(2, dur.getSeconds());
    }
}
