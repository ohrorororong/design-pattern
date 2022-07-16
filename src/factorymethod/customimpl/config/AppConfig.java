package factorymethod.customimpl.config;

import factorymethod.customimpl.CoffeeStore;
import factorymethod.customimpl.factory.CoffeeFactory;
import factorymethod.customimpl.factory.Impl.StarbucksFactoryImpl;
import factorymethod.customimpl.repository.CoffeeRepository;
import factorymethod.customimpl.repository.Impl.StarbucksRepositoryImpl;
import factorymethod.customimpl.service.CoffeeService;
import factorymethod.customimpl.service.Impl.StarbucksServiceImpl;

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
