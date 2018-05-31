# Penetration Security Testing

   [Ethical Hacking](https://www.tutorialspoint.com/ethical_hacking/ethical_hacking_overview.htm): Ethical hacking is legal since the purpose is to find weakness in the system or network. It recovers lost information, especially in case you lost your password and puts adequate preventative measures in place to prevent security breaches.

   [Penetration testing](http://en.wikipedia.org/wiki/Penetration_test): Penetration testing try to exploit the vulnerabilities in a system. Penetration testing involves network penetration testing and application security testing. It also controls and processes around the networks and applications.
   
   [Penetration testing](http://en.wikipedia.org/wiki/Penetration_test) is a usually a form of [black box](http://en.wikipedia.org/wiki/Black-box_testing) security testing. In a pen test you are trying to break into the server as many times as possible and report back on how they where able to break in. This is often done multiple times to make sure that the patches hold water. This is an important type of security testing because its as real world as it gets. Regular penetration testing is a requirement of the PCI-[DSS](http://en.wikipedia.org/wiki/Payment_Card_Industry_Data_Security_Standard). Common tools for web application penetration testing are [Acunetix](http://www.acunetix.com/)($), NTOSpider($$$), w3af(open source) and Wapiti(Open Source). For other types of penetration testing it is common to use [Metasploit](http://www.metasploit.com/)(open source), [OpenVAS](http://www.openvas.org/)(open source), NMAP and THC-Hydra.

   By contrast in it [white box](http://en.wikipedia.org/wiki/White-box_testing) testing you have full access to the source code. You can enable drugging on the application to get better test results from scanners like Acuenetix. You can also use Source Code Analysis Tools such as [RATS](http://www.fortify.com/security-resources/rats.jsp)(Open Source) and [Coverity](http://www.coverity.com/)($$$$$).
   
   There are 2 different forms of Denial Of Service attacks. The most simple is a Distributed Denial of service attack in which the hacker is using a bot net to flood your server with traffic. This traffic could be an ICMP Ping, or even a simple HTTP GET request. Cisco has a number of [very expensive products](http://www.cisco.com/en/US/tech/tk59/technologies_white_paper09186a0080174a5b.shtml) to help prevent this type of attack.

   Another form of Denial Of Service is when there is a problem with the server its self. When this type of security flaws are found its often given a CVE number becuase it is a violation of [CWE-400](http://cwe.mitre.org/data/definitions/400.html). This is commonly due to an arithmetic overflow or stack/heap based memory corruption (a buffer overflow or dangling pointer). To prevent these types of attacks you should make sure that your software is up to date. Its not often that an 0-day DoS attack is used in the wild.
   
1. [Penetration Testing (Pen-Testing)](http://www.softwaretestinghelp.com/penetration-testing-guide/)
2. [Source Code Analysis (A.K.A. Static Code Analysis)](https://www.owasp.org/index.php/Static_Code_Analysis)
3. [Testing for Denial of Service](https://www.owasp.org/index.php/Testing_for_Denial_of_Service)
4. [Cloud-based Security](https://techbeacon.com/pen-testing-cloud-based-apps-step-step-guide)
5. [Network Security](https://en.wikipedia.org/wiki/Network_security)
6. [Infrastructure Security](https://www.techotopia.com/index.php/IT_Infrastructure_Security)
7. [Web Application Security](https://en.wikipedia.org/wiki/Web_application_security)
8. [Mobile Security](https://en.wikipedia.org/wiki/Mobile_security)
9. Tools
  * [Online Web Scan Pen Test](https://pentest-tools.com/home)
  * [Iron Wasp](https://ironwasp.org/)
  * Web Application Security
    * [ZAP](https://www.zaproxy.org/)
  * Infrastructure Security 
    * [Scout2](https://github.com/nccgroup/Scout2)
    * [Prowler](https://github.com/toniblyx/prowler)
  * Network Security 
    * [Telnet Open Port](https://en.wikipedia.org/wiki/Telnet)
    * [NMAP](https://nmap.org/)
    * [Wireshark](https://www.wireshark.org/)
    * [Cain and Able](https://en.wikipedia.org/wiki/Cain_and_Abel_(software))
  * SQL Injection
    * [Blind Injection](https://www.owasp.org/index.php/Blind_SQL_Injection)
    * [Error Messages](http://www.pigadas.com/blog/2011/07/24/error-based-sql-injection-in-oracle-11g/)
	* [Tautology Based Injection](http://ieeexplore.ieee.org/xpl/login.jsp?tp=&arnumber=5375870&url=http://ieeexplore.ieee.org/iel5/5375735/5375746/05375870.pdf?arnumber=5375870)
	  * [Tool: Wapiti](http://sourceforge.net/projects/wapiti/)
	  * [Tool: Skipfish](http://code.google.com/p/skipfish/)
	  * [Tool: Sitewatch]()