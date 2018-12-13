import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

@Mojo(name = "demo")
public class DemoMojo extends AbstractMojo {

  private static final Logger LOG = LoggerFactory.getLogger(DemoMojo.class);

  public void execute() throws MojoExecutionException, MojoFailureException {
    // this works fine
    LOG.info("Hello world!");

    // this will fail
    LOG.info("{}", Level.DEBUG);
  }
}
