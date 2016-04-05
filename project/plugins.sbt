logLevel := Level.Warn

resolvers += "twitter-repo" at "https://maven.twttr.com"
addSbtPlugin("com.twitter" % "scrooge-sbt-plugin" % "4.5.0")

addSbtPlugin("no.arktekk.sbt" % "aether-deploy" % "0.17")
