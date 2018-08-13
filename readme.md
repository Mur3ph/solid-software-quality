# Software Quality and Test



## Software Quality & Testing techniques
1. [Selenium(Selenium automates browsers) - Selenium IDE, Selenium WebDriver, Selenium client API, Selenium Grid, Selendroid, Appium](http://www.seleniumhq.org/)
2. [Unit Testing - JUnit, NUnit etc.](https://en.wikipedia.org/wiki/Unit_testing)
3. [Mutation testing](https://en.wikipedia.org/wiki/Mutation_testing)

   Mutation tests your suite rather than your application. Introducing small errors (called mutations) into your application (errors that are not supposed to fix bugs or provide new functionality) to see if your test suite picks them up.
   
4. [Mockito](http://site.mockito.org/)
5. [SoapUI (REST & SOAP Testing Tool)](https://www.soapui.org/)
6. [TestNG](http://testng.org/doc/)
7. [Browser debugging (Console, Firebug etc.)]()
8. [Postman](https://www.getpostman.com/)
9. [Fiddler](https://www.telerik.com/fiddler)
10. [Refactoring](https://en.wikipedia.org/wiki/Code_refactoring)
11. [Debugging](https://simpleprogrammer.com/2011/06/17/the-debugger-mindset/)
12. [Serenity (Automated Acceptance testing)](http://www.thucydides.info/#/)
13. [FindBugs](http://findbugs.sourceforge.net/)
14. [Java Performance Optimization](https://dzone.com/refcardz/java-performance-optimization)
15. [JRat](http://jrat.sourceforge.net/)
16. [JMock](http://www.jmock.org/)
17. [SonarQube (Code Quality)](https://www.sonarqube.org/)
18. [Cucumber](https://cucumber.io/)
19. [Test Automation](https://simpleprogrammer.com/getting-up-to-bat-series/)
20. [Whitebox testing (Test source code flow)](https://en.wikipedia.org/wiki/White-box_testing)
21. [Blackbox testing (Test UI functionality of application)](https://en.wikipedia.org/wiki/Black-box_testing)
22. [Boundary conditions](https://en.wikipedia.org/wiki/Boundary_testing)
23. [Acceptance testing](http://softwaretestingfundamentals.com/acceptance-testing/)
24. [System testing](http://softwaretestingfundamentals.com/system-testing/)
25. [Integration testing](https://en.wikipedia.org/wiki/Integration_testing)

   Integration tests demonstrate that different pieces of the system work together. Integration tests cover whole applications.

26. [Unit Testing](https://en.wikipedia.org/wiki/Unit_testing)
27. [Regression testing](https://en.wikipedia.org/wiki/Regression_testing)

   The idea of regression tests is to make a change to your application as required for bug fixing or new functionality, and regression testing will hopefully catch any problems (or regressions) with your changes.

28. [Apache JMeter](http://jmeter.apache.org/)
29. [GUI testing](https://www.qfs.de/en/qf-test/java-testing.html)
30. [TestFX](https://github.com/TestFX/TestFX/wiki)
31. [MSTest, JBehave, Karma, Protractor and Microsoft UI Automation]()
32. [REST Assured](http://rest-assured.io/)
33. [DBUnit](http://dbunit.sourceforge.net/)
34. [cURL](https://curl.haxx.se/)
35. [Arquillian](http://arquillian.org/)
36. [Cypress](https://www.cypress.io/)
37. [QTP (Automated Functional Testing tool)](https://www.guru99.com/quick-test-professional-qtp-tutorial-1.html)
38. [Capybara (Web-based test automation software that simulates scenarios for user stories)](https://github.com/teamcapybara/capybara)
39. [Fundamentals of software testing and quality](https://www.google.com/search?q=fundamentals+of+software+testing+and+quality&ie=utf-8&oe=utf-8&client=firefox-b-ab)
40. [Logs](https://12factor.net/logs)
41. [Test Containers](http://www.java-allandsundry.com/2018/05/testcontainers-and-spring-boot.html)
41. [WireMock](https://www.petrikainulainen.net/programming/testing/wiremock-tutorial-request-matching-part-one/?utm_source=twitter&utm_medium=social&utm_campaign=new-blog-post)
42. [Lombok: Introduction to Project Lombok by baeldung ](http://www.baeldung.com/intro-to-project-lombok)



## Penetration Security Testing

   [Ethical Hacking](https://www.tutorialspoint.com/ethical_hacking/ethical_hacking_overview.htm): Ethical hacking is legal since the purpose is to find weakness in the system or network. It recovers lost information, especially in case you lost your password and puts adequate preventative measures in place to prevent security breaches.

   [Penetration testing](http://www.softwaretestinghelp.com/penetration-testing-guide/): Penetration testing try to exploit the vulnerabilities in a system. Penetration testing involves network penetration testing and application security testing. It also controls and processes around the networks and applications.
   
   [Penetration testing](http://en.wikipedia.org/wiki/Penetration_test) is a usually a form of [black box](http://en.wikipedia.org/wiki/Black-box_testing) security testing. In a pen test you are trying to break into the server as many times as possible and report back on how they where able to break in. This is often done multiple times to make sure that the patches hold water. This is an important type of security testing because its as real world as it gets. Regular penetration testing is a requirement of the PCI-[DSS](http://en.wikipedia.org/wiki/Payment_Card_Industry_Data_Security_Standard). Common tools for web application penetration testing are [Acunetix](http://www.acunetix.com/)($), NTOSpider($$$), w3af(open source) and Wapiti(Open Source). For other types of penetration testing it is common to use [Metasploit](http://www.metasploit.com/)(open source), [OpenVAS](http://www.openvas.org/)(open source), NMAP and THC-Hydra.

   By contrast in it [white box](http://en.wikipedia.org/wiki/White-box_testing) testing you have full access to the source code. You can enable drugging on the application to get better test results from scanners like Acuenetix. You can also use Source Code Analysis Tools such as [RATS](http://www.fortify.com/security-resources/rats.jsp)(Open Source) and [Coverity](http://www.coverity.com/)($$$$$).
   
   There are 2 different forms of Denial Of Service attacks. The most simple is a Distributed Denial of service attack in which the hacker is using a bot net to flood your server with traffic. This traffic could be an ICMP Ping, or even a simple HTTP GET request. Cisco has a number of [very expensive products](http://www.cisco.com/en/US/tech/tk59/technologies_white_paper09186a0080174a5b.shtml) to help prevent this type of attack.

   Another form of Denial Of Service is when there is a problem with the server its self. When this type of security flaws are found its often given a CVE number becuase it is a violation of [CWE-400](http://cwe.mitre.org/data/definitions/400.html). This is commonly due to an arithmetic overflow or stack/heap based memory corruption (a buffer overflow or dangling pointer). To prevent these types of attacks you should make sure that your software is up to date. Its not often that an 0-day DoS attack is used in the wild.
   



## Monitoring and Performance tools
1. [JConsole (Packaged with JDK)](https://docs.oracle.com/javase/7/docs/technotes/guides/management/jconsole.html)
2. [Apache JMeter](http://jmeter.apache.org/)
3. [Java Performance Optimization](https://dzone.com/refcardz/java-performance-optimization)
4. [Java Mission Control (JMC)](http://www.oracle.com/technetwork/java/javaseproducts/mission-control/java-mission-control-1998576.html)
5. [VisualVM](http://visualvm.java.net/)



## Frameworks (A framework is simply a set of libraries that are used to develop code on a particular platform or on multiple platforms)
1. [Selenium (Selenium automates browsers) - Selenium IDE, Selenium WebDriver, Selenium client API, Selenium Grid, Selendroid, Appium](http://www.seleniumhq.org/)
2. [Spock Framework](http://spockframework.org/)
3. [Spring Test](https://docs.spring.io/spring/docs/current/spring-framework-reference/testing.html)
4. [Robot Framework](http://robotframework.org/)



## Design Patterns
1. [Strategy Pattern(Dependency Injection)](https://dzone.com/articles/java-the-strategy-pattern)
2. [Observer Pattern(Event Listener)](https://dzone.com/articles/the-observer-pattern-using-modern-java)
3. [Builder Pattern( While Writing Unit Tests )](https://stackoverflow.com/questions/5007355/builder-pattern-in-effective-java)
4. [Factory Pattern(Web framewroks)](https://dzone.com/articles/java-the-factory-pattern)
5. [Facade(REST)](https://dzone.com/articles/design-patterns-uncovered-1)
6. [Singleton](https://stackoverflow.com/questions/70689/what-is-an-efficient-way-to-implement-a-singleton-pattern-in-java)
7. [Software Testing Anti-patterns](http://blog.codepipes.com/testing/software-testing-antipatterns.html)



## Design Principles
1. [SOLID](https://dzone.com/search?page=1)



## Tutorials & Training
1. [Using Cucumber with Selenium](https://www.guru99.com/using-cucumber-selenium.html)
2. [On Test Automation (Bas Dijkstra)](https://www.ontestautomation.com/training/)
3. [Page Object Model (POM) & Page Factory in Selenium: Complete Tutorial](https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html)
4. [Understand Stub, Mock and Fake in Unit Testing (C#)](https://www.c-sharpcorner.com/UploadFile/dacca2/understand-stub-mock-and-fake-in-unit-testing/)
5. [Test Automation Guru](http://www.testautomationguru.com/selenium/)
 * [Selenium WebDriver – Scriptless Page Object Design Pattern](http://www.testautomationguru.com/selenium-webdriver-scriptless-page-object-design-pattern-part-1/)
6. [ToolsQA](http://toolsqa.com/selenium-webdriver/page-object-model/)



## Interesting Articles % Sites
1. [10 Essential Unit and Integration #Testing #tools for #Java Programmers](http://javarevisited.blogspot.ie/2018/01/10-unit-testing-and-integration-tools-for-java-programmers.html)
2. [**Must Read, Great Read**: Software Testing Anti-patterns](http://blog.codepipes.com/testing/software-testing-antipatterns.html#anti-pattern-1---having-unit-tests-without-integration-tests)
3. [Application Security Testing on Cloud and the Future of Penetration Testing](https://securityintelligence.com/application-security-testing-on-cloud-and-the-future-of-penetration-testing/)
4. [37 Most Powerful Penetration Testing Tools (Security Testing Tools)](http://www.softwaretestinghelp.com/penetration-testing-tools/)
5. [Fundamentals of Testing](https://drive.google.com/file/d/1FU-qwuNnUyuhh_ABqqeXPcwAYVgn1D2X/view)
6. [Using Mockito with JUnit 5](https://igorski.co/java/junit/mockito-with-junit5/)
7. [Test automation training is broken. Here's how to fix it](https://techbeacon.com/test-automation-training-broken-heres-how-fix-it?utm_source=newsletter&utm_medium=email&utm_campaign=tbnewsletter135)
8. [Software testing as a career](https://www.guru99.com/software-testing-career-complete-guide.html)
9. [Periodic Table of Testing](https://www.thebigtesttheory.com/?m=1)
10. [Top 10 Websites Every Software Tester Should Follow in 2018](https://dzone.com/articles/top-10-websites-for-every-software-tester-should-f)



## Video
1. [Simon Stewart, Selenium State of the Union  (Youtube)](https://www.youtube.com/watch?v=5o6Rb8W9_Do&feature=youtu.be&t=28m39s)
2. [ToolsQA (Youtube)](https://www.youtube.com/channel/UCSVljVzYbFphBtHvJgwMLsg/videos)



## Books
1. [Growing Object-Oriented Software, Guided by Tests (Beck Signature)](https://www.amazon.co.uk/dp/0321503627/ref=as_li_qf_asin_il_tl?slotNum=3&ie=UTF8&linkCode=g12&linkId=58eb6083d58d6083419861c746c38e5c&imprToken=mOhjztiRSLnz68HXLBjBVA&creativeASIN=0321503627&tag=sandordargo-21&creative=9325)
2. [Selenium Design Patterns and Best Practices](https://www.amazon.com/Selenium-Design-Patterns-Best-Practices/dp/1783982705)
3. [Pragmatic Unit Testing in Java with JUnit](ftp://ftp.borg.moe/yarr/Gentoomen%20Library/Programming/Pragmatic%20Programmers/Pragmatic%20Unit%20Testing%20in%20Java%20with%20JUnit.pdf)



## Certification
1. [ISTQB foundation level](https://www.istqb.org/certification-path-root/foundation-level/foundation-level-in-a-nutshell.html)
2. [ISTQB sample papers](https://drive.google.com/file/d/0B4_lHtwH2YI0d05mTVVYVl9XM1E/view)


