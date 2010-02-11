require 'rubygems'
require 'sinatra'
require 'json'

get '/' do
  erb :index
end

post '/parse' do

  # shell out to the parser with the given input
  parser = IO.popen("java -jar parser.jar '#{params[:value]}'", "w+")
  output = [] 
  while data = gets
    output += parser.readlines
  end
  puts "The output is: #{output.inspect}"
  parser.close

  content_type :json
  output[0]
end
