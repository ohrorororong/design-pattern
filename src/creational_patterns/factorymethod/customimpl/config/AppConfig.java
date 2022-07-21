package creational_patterns.factorymethod.customimpl.config;

import creational_patterns.factorymethod.customimpl.CoffeeStore;
import creational_patterns.factorymethod.customimpl.factory.CoffeeFactory;
import creational_patterns.factorymethod.customimpl.factory.Impl.StarbucksFactoryImpl;
import creational_patterns.factorymethod.customimpl.repository.CoffeeRepository;
import creational_patterns.factorymethod.customimpl.repository.Impl.StarbucksRepositoryImpl;
import creational_patterns.factorymethod.customimpl.service.CoffeeService;
import creational_patterns.factorymethod.customimpl.service.Impl.StarbucksServiceImpl;

public class AppConfig {
    private static volatile AppConfig instance = null;

    private AppConfig() {}

    public static AppConfig getInstance() {
        if (instance == null) {
            synchronized (AppConfig.class) {
                if (instance == null) {
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }

    public CoffeeStore coffeeStore() {
        return new CoffeeStore(coffeeFactory(), coffeeService());
    }

    private CoffeeService coffeeService() {
        return new StarbucksServiceImpl(coffeeRepository());
    }

    private CoffeeFactory coffeeFactory() {
        return new StarbucksFactoryImpl(coffeeRepository());
    }

    private CoffeeRepository coffeeRepository() {
        return new StarbucksRepositoryImpl();
    }
}
