require 'rubygems'
require 'sinatra'

get '/' do
  erb :index
end

post '/parse' do

  puts 'parsing'

  # invoke the parser with the given input
  output = ""
  IO.popen("java -jar parser.jar '#{params[:value]}'") do |parser|
    parser.each{|line| output << line} 
  end

  content_type :json
  output
end
