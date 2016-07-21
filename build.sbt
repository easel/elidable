scalaVersion := "2.11.8"
crossScalaVersions := Seq(scalaVersion.value)
//
//scalacOptions := Seq("-Xelide-below", "SEVERE") // does not work, 1000 > 2000, not below
//scalacOptions := Seq("-Xelide-below", "WARNING") // does not work, 2000 = 2000, not below
scalacOptions := Seq("-Xelide-below", "MAXIMUM") // works, Int.MaxValue > 2000
//scalacOptions := Seq("-Xelide-below", "OFF") // works, Int.MaxValue > 2000
//scalacOptions := Seq("-Xelide-below", "2001") // works 2001 > 2000
//scalacOptions := Seq("-Xdisable-assertions") // works
