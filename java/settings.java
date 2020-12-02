########################################################################################
# ribbon
hit.ribbon.eureka.enabled=false
# Max number of retries on the same server (excluding the first try)
hit.ribbon.MaxAutoRetries=2
# Max number of next servers to retry (excluding the first server)
hit.ribbon.MaxAutoRetriesNextServer=2
# Whether all operations can be retried for this client
hit.ribbon.OkToRetryOnAllOperations=true
# Interval to refresh the server list from the source
hit.ribbon.ServerListRefreshInterval=2000
# Connect timeout used by Apache HttpClient
hit.ribbon.ConnectTimeout=5000
# Read timeout used by Apache HttpClient
hit.ribbon.ReadTimeout=90000
# Initial list of servers, can be changed via Archaius dynamic property at runtime
hit.ribbon.listOfServers=http://localhost:9081, http://localhost:9082