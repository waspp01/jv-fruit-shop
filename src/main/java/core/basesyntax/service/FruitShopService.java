package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.strategy.OperationStrategy;
import java.util.List;

public interface FruitShopService {
    void processTransactions(List<FruitTransaction> fruitTransactionsList,
                             OperationStrategy operationStrategy);
}