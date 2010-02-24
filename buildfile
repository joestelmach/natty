repositories.remote << 'http://www.ibiblio.org/maven2'

desc 'The date project'
define 'natty' do
  project.group = 'com.natty'
  project.version = '0.1-SNAPSHOT'
  compile.options.source = "1.6"
  compile.options.target = "1.6"

  GENERATED_DIR = path_to('target/generated/antlr')
  GRAMMAR_DIR = path_to('src/main/antlr3/com/natty/date/generated')
  PACKAGE = 'com/natty/date/generated'
  GRAMMAR_OPTIONS = {'DateParser.g' => ['-debug'], 'DateWalker.g' => ['-debug']}

  # create a list of file tasks for each java class that needs to be generated
  # based on the grammar files found
  grammar_file_tasks = FileList["#{GRAMMAR_DIR}/*.g"].collect do |grammar_file|
  puts grammar_file
    grammar_name = grammar_file.split('/').last
    java_file = "#{GENERATED_DIR}/#{PACKAGE}/#{grammar_name.gsub('.g', '.java')}"
    file java_file => grammar_file do |task|
      # make sure we have some work to do
      #return if File.exists?(java_file) && File.mtime(grammar_file) < File.mtime(java_file)
      puts java_file

      # ensure our output directory exists
      mkdir_p GENERATED_DIR
      args = ['-o', GENERATED_DIR] + (GRAMMAR_OPTIONS[grammar_name] || [])

      args << grammar_file
      Java.load
      Java.classpath << ["org.antlr:antlr:jar:3.2", "antlr:antlr:jar:2.7.7"]
      Java.org.antlr.Tool.new(args.to_java(Java.java.lang.String)).process
    end
  end
  generate = file GENERATED_DIR => grammar_file_tasks

  compile.from generate 
  compile.with 'org.json:json:jar:20090211', 'org.antlr:antlr-runtime:jar:3.2'
  package :jar, :id => 'date'
end
