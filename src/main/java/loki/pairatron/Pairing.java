package loki.pairatron;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class Pairing {

    private final List<String>  developers;
    private final String stream;
    private final LocalDate date;

    public String getStream() {
        return stream;
    }

    public LocalDate getDate(){
        return date;
    }

    public List<String> getDevelopers() {
        return developers;
    }

    public Pairing(List<String> developers, String stream, LocalDate date) {
        this.developers = Collections.unmodifiableList(developers);
        this.stream = stream;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pairing pairing = (Pairing) o;
        return Objects.equals(developers, pairing.developers) &&
                Objects.equals(stream, pairing.stream) &&
                Objects.equals(date, pairing.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(developers, stream, date);
    }

}
