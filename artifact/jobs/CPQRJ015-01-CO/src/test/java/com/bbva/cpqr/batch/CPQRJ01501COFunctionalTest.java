package com.bbva.cpqr.batch;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test for batch process CPQRJ015-01-CO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/META-INF/spring/batch/beans/CPQRJ015-01-CO-beans.xml","classpath:/META-INF/spring/batch/jobs/jobs-CPQRJ015-01-CO-context.xml","classpath:/META-INF/spring/jobs-CPQRJ015-01-CO-runner-context.xml"})
public class CPQRJ01501COFunctionalTest{

	@Autowired
	private JobLauncherTestUtils jobLauncherTestUtils;


	@Test
	public void testLaunchJob() throws Exception {
		//TODO implements job launch test
		//Without parameters (use this implementation if job not need parameters)

		final HashMap<String, JobParameter> parameters = new HashMap<String, JobParameter>();
		final JobParameter pathInJobParameter = new JobParameter("src/test/resources/datsal/Persona.csv");
		parameters.put("inPath", pathInJobParameter);

		final JobParameters jobParameters = new JobParameters(parameters);
		final JobExecution jobExecution = jobLauncherTestUtils.launchJob(jobParameters);


		//TODO implements job launch test Assert's
		Assert.assertTrue(jobExecution.getExitStatus().equals(ExitStatus.COMPLETED));
	}
}
