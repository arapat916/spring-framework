@Configuration
public class ConfigApp {
    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

    @Bean
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

}