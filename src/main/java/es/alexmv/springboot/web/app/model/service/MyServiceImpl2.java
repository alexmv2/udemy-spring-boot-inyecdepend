package es.alexmv.springboot.web.app.model.service;

import org.springframework.stereotype.Service;

@Service("myService2")
public class MyServiceImpl2 implements IMyService{

	@Override
	public String operacion() {
		return "Ejecutando alguna operacion con myService2...";
	}
}
