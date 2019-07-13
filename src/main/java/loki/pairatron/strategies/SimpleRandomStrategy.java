package loki.pairatron.strategies;

import loki.pairatron.Pairing;
import loki.pairatron.PairingStrategy;

import java.time.LocalDate;
import java.util.List;

/**
 * A strategy that does not consider history but just randomly assigns people to pairs and streams
 */
public class SimpleRandomStrategy implements PairingStrategy {


    public List<Pairing> doPairing(List<String> availableDevs, List<String> streams, List<List<Pairing>> history, LocalDate dateToPlanFor) {
        return null;
    }
}
