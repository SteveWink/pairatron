package loki.pairatron;

import java.time.LocalDate;
import java.util.List;

public class Pairatron {

    public Pairatron(PairingStrategy strategy, List<String> availableDevs,
                     List<String> streams, List<List<Pairing>> historicData) {
        this.strategy = strategy;
        this.availableDevs = availableDevs;
        this.historicData = historicData;
        this.streams = streams;
    }

    private PairingStrategy strategy;
    private List<String> availableDevs;
    private List<List<Pairing>> historicData;
    private List<String> streams;

    public List<Pairing> doPairings(LocalDate date){
        return strategy.doPairing(availableDevs, streams,  historicData, date);
    }

}
