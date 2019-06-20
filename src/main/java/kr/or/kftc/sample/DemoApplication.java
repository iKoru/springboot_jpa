package kr.or.kftc.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import kr.or.kftc.sample.my.MyController;

@SpringBootApplication
// @EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
// @EnableJpaRepositories(basePackages = "kr.or.kftc.sample.repository")
// @EntityScan(basePackages = "kr.or.kftc.sample.dto")
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private MyController myController;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(myController.control());
		// HibernateMain.main(null);
	}

	// @Autowired
	// DataSource dataSource;

	// @Bean
	// public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	// // JpaVendorAdapteradapter can be autowired as well if it's configured in
	// // application properties.
	// HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	// vendorAdapter.setGenerateDdl(false);

	// LocalContainerEntityManagerFactoryBean factory = new
	// LocalContainerEntityManagerFactoryBean();
	// factory.setJpaVendorAdapter(vendorAdapter);
	// // Add package to scan for entities.
	// factory.setPackagesToScan("kr.or.kftc.sample");
	// factory.setDataSource(dataSource);
	// return factory;
	// }

	// @Bean
	// public PlatformTransactionManager transactionManager(EntityManagerFactory
	// entityManagerFactory) {
	// JpaTransactionManager txManager = new JpaTransactionManager();
	// txManager.setEntityManagerFactory(entityManagerFactory);
	// return txManager;
	// }
}
