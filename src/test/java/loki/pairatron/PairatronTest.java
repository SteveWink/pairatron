package loki.pairatron;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PairatronTest {

    @Mock PairingStrategy strategy;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void pairatronDoPairingShouldCallTheStrategyMethodWithTheAvailableDevsStreamsDateAndCopesWithNullHistory(){

        List<String> availableDevs = List.of("remus", "steve", "tomasz", "david");

        List<String> streams = List.of("prometheus", "nbcu");
        Pairatron underTest = new Pairatron(strategy,availableDevs,streams,null);
        LocalDate date = LocalDate.now();
        underTest.doPairings(date);
        verify(strategy).doPairing(availableDevs,streams,null, date);
    }
}