package es.alexmv.springboot.web.app.model.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("myService")
@Primary
public class MyServiceImpl implements IMyService{

	@Override
	public String operacion() {
		return "Ejecutando alguna operacion en myService...";
	}
}
