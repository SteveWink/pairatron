package loki.pairatron;

import java.time.LocalDate;
import java.util.List;

public interface PairatronStore {
    public void storeHistory(List<Pairing> daysPairing, LocalDate date);

    public List<List<Pairing>> getStoredHistory();

    public List<String> getAvailableDevs(LocalDate date);

    public List<String> getStreams(LocalDate date);
}
