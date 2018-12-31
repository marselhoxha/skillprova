package com.proxima.skillprova.rest;


import com.proxima.skillprova.model.DashboardCount;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardRestController {

	@RequestMapping(value = "/dashboardcount", method = RequestMethod.GET)
	public DashboardCount dashboardCount() {
		DashboardCount dashboardCount = new DashboardCount();
		dashboardCount.setActiveInstances("90");
		dashboardCount.setCustomers("145");
		dashboardCount.setProjects("81");
		dashboardCount.setVirtualMachines("121");
		return dashboardCount;
	}


}
